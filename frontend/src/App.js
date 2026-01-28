import {useState, useEffect} from 'react';

function App() {
    const [text, setText] = useState('');
    const [sentiment, setSentiment] = useState('');
    const [history, setHistory] = useState([]);

    const analyze = async () => {
        const res = await fetch('http://localhost:8080/api/sentiment', {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({text}),
        });

        const data = await res.json();
        setSentiment(data.sentiment);
        loadHistory();
    };

    const loadHistory = async () => {
        const res = await fetch('http://localhost:8080/api/sentiment');
        const data = await res.json();
        setHistory(data);
    };
    useEffect(() => {
        loadHistory();
    }, []);

    return (
        <div style={{padding: 40}}>
            <h2>AI Sentiment Analyzer</h2>

            <input
                value={text}
                onChange={(e) => setText(e.target.value)}
                placeholder='Enter text'
                style={{width: 300, padding: 8}}
            />

            <button onClick={analyze} style={{marginLeft: 10}}>
                Predict
            </button>

            <h3>Result: {sentiment}</h3>

            <h3>History</h3>

            <ul>
                {history.map((h) => (
                    <li key={h.id}>
                        {h.text} → {h.sentiment}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default App;
